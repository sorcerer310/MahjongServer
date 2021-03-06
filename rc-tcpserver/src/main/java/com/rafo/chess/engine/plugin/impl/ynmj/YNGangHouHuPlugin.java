package com.rafo.chess.engine.plugin.impl.ynmj;

import com.rafo.chess.engine.action.IEPlayerAction;
import com.rafo.chess.engine.action.exception.ActionRuntimeException;
import com.rafo.chess.engine.calculate.Calculator;
import com.rafo.chess.engine.calculate.PayDetailed;
import com.rafo.chess.engine.majiang.MJPlayer;
import com.rafo.chess.engine.majiang.action.IEMajongAction;
import com.rafo.chess.engine.plugin.AbstractPlayerPlugin;
import com.rafo.chess.engine.plugin.IOptPlugin;
import com.rafo.chess.engine.plugin.IPluginCheckCanExecuteAction;
import com.rafo.chess.engine.plugin.OptPluginFactory;
import com.rafo.chess.engine.room.RoomInstance;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/10.
 */
public class YNGangHouHuPlugin extends AbstractPlayerPlugin<IEPlayerAction> {

    @Override
    public void doOperation(IEPlayerAction action) throws ActionRuntimeException {
        if (action.getActionType() != IEMajongAction.PLAYER_ACTION_TYPE_CARD_HU)
            return;
        RoomInstance roomIns = action.getRoomInstance();
        int step = action.getStep();

        IEPlayerAction last1 = roomIns.getEngine().getMediator().getDoneActionByStep(step);
        if(last1.getActionType() != IEMajongAction.PLAYER_ACTION_TYPE_CARD_GUO){
            last1 = roomIns.getEngine().getMediator().getDoneActionByStep(step);
        }

        // 自摸或打牌操作
        if (last1 == null || (last1.getActionType() != IEMajongAction.PLAYER_ACTION_TYPE_CARD_GETIN
                && last1.getActionType() != IEMajongAction.PLAYER_ACTION_TYPE_CARD_PUTOUT)) {
            // return;
        }

        if(last1.getActionType() == IEMajongAction.PLAYER_ACTION_TYPE_CARD_PUTOUT){
            step -= 1;
        }

        // 杠牌操作
        IEPlayerAction last2 = roomIns.getEngine().getMediator().getDoneActionByStep(step = (step - 2));
        if (last2 == null || last2.getActionType() != IEMajongAction.PLAYER_ACTION_TYPE_CARD_GANG) {
            return;
        }

        if(last2.getPlayerUid() != action.getPlayerUid()){
            return;
        }

        PayDetailed pay = this.payment(action);
        pay.setPayType(PayDetailed.PayType.Multiple);
    }

    @Override
    public boolean doPayDetail(PayDetailed pd, RoomInstance room, Calculator calculator) {
        if(pd.getFromUid().length > 1) {
            calculator.addCardBalance(pd.getToUid(), this.getGen().getZimoFlag(), pd.getCards(), 0);
        }
        return true;
    }

}
