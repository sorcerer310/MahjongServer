package com.rafo.chess.common;

public class GlobalConstants {

	final public static int ROOM_CREATE_SUCCESS = 0x110009;
	final public static int ROOM_ENTER_SUCCESS = 0x11000b;
	final public static int ROOM_ENTER_FAILED_NUMBER_ERROR = 0x101000b;
	final public static int ROOM_ENTER_FAILED_HAS_IN_OTHER_ROOM = 0x111000b;
	final public static int ROOM_ENTER_FAILED_ROOM_FULL = 0x121000b;
	final public static int ROOM_DESTORY_SUCCESS = 0x11000d;
	final public static int ROOM_DESTORY_FAILED_NOT_OWNER = 0x101000d;
	final public static int ROOM_DESTORY_FAILED_NOT_IN_ROOM = 0x111000d;
	final public static int ROOM_DESTORY_FAILED_IN_BATTLE = 0x121000d;
	final public static int ROOM_DESTORY_FAILED_ROOM_NUM_ERROR = 0x131000d;
	final public static int WC_VOTE_DESTROY_SUCCESS = 0x110017;
	final public static int WC_VOTE_DESTROY_FAILED_REFUSED = 0x1010017;
	final public static int WC_VOTE_DESTROY_VOTING = 0x1110017;
	final public static int WC_VOTE_DESTROY_FAILED_EXISTED = 0x1210017;
	final public static int WC_VOTE_DESTROY_FAILED_NOT_IN_ROOM = 0x1310017;
	final public static int WC_VOTE_DESTROY_FAILED_HAS_VOTED = 0x1410017;
	final public static int ROOM_DESTROY_DIRECT = 0x1510017;
	final public static int ROOM_RECORD_SUCCESS = 0x110019;
	final public static int ROOM_RECORD_FAILED = 0x1010019;
	final public static int ROOM_RECORD_FAILED_NODATA = 0x1110019;
	final public static int ROUND_RECORD_SUCCESS = 0x11001b;
	final public static int BW_CHAT_SEND_SUCCESS = 0x130002;
	final public static int BW_CHAT_SEND_FAILED = 0x1030002;
	final public static int BW_Battle_Step_SUCCESS = 0x130006;
	final public static int BW_Battle_Step_InValid_Operator = 0x1030006;
	final public static int BG_AUTO_DESTROY_SUCCESS = 0x14000a;
	final public static int BG_AUTO_DESTROY_FAILED_NO_IN_ROOM = 0x104000a;
	final public static int ROOM_QUIT_SUCCESS = 0x11001e;
	final public static int ROOM_QUIT_FAILED_NOT_IN_ROOM = 0x101001e;
	final public static int ROOM_QUIT_FAILED_IN_BATTLE = 0x111001e;
	final public static int ROOM_QUIT_FAILED_IS_OWNER = 0x121001e;
	final public static int ROOM_QUIT_FAILED_ERROR_ROOM = 0x131001e;
	final public static int ROUND_RECORD_FAILED_NODATA = 0x111001b;
	final public static int ROOM_CREATE_FAILED_ROOMCARD_NOT_ENOUGTH = 0x1010009;
	final public static int ROOM_CREATE_FAILED_INNER_ERROR = 0x1110009;
	final public static int ROOM_CREATE_FAILED_ALREADY_IN_ROOM = 0x1210009;
	final public static int LOGIN_SUCCESS = 0x110004;
	final public static int LOGIN_FAILED = 0x1010004;
	final public static int SYSTEM_ERROR = 0x1110005;
	final public static int LOGOUT_KICKOFF = 0x1010007;
	final public static int LOGOUT_FORBID = 0x1110007;

	final public static String ZONE_NAME = "BasicExamples";


}
