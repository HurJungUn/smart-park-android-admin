package smartpark.com.admin.util;

import android.os.Environment;

/**
 * 상수
 */
public class Const {
    /**
     * 시간
     */
    public static final long TIMER_500 = 500;
    public static final long TIMER_1000 = 1000;
    public static final long TIMER_2000 = 2000;
    public static final long TIMER_5000 = 5000;

    /**
     * Activity result 값이 필요한 code
     */
    public static final int REQUEST_REFRESH = 100;
    public static final int REQUEST_PICK_FROM_CAMERA = 200;
    public static final int REQUEST_PICK_FROM_ALBUM = 300;
    public static final int REQUEST_ATTENDANCE = 400;

    /**
     * MAP 상수
     */
    public static final int MAP_ZOOM_LEVEL = 15;
    public static final int MAP_ZOOM_MAX_LEVEL = 19;
    public static final int MAP_ZOOM_MIN_LEVEL = 14;
    public static final float MAP_MARKER_X = 0.5f;
    public static final float MAP_MARKER_Y = 1.0f;
    public static final String MAP_ID_CURRENT = "current_location";

    /**
     * EditText 최대 사용 길이
     */
    public static final int TEXT_MAX_LEN_MEMBER_NAME =  20;
    public static final int TEXT_MAX_LEN_PHONE_NUM = 15;
    public static final int TEXT_MAX_LEN_AUTH_NUM = 10;

    /**
     * Intent에 전달 할 데이터
     */
    public static final String BUNDLE_PKL_ID = "BUNDLE_PKL_ID";
    public static final String BUNDLE_PKL_DISCRETE = "BUNDLE_PKL_DISCRETE";
    public static final String BUNDLE_OBJECT = "BUNDLE_OBJECT";
    public static final String BUNDLE_OBJECT_LIST = "BUNDLE_OBJECT_LIST";
    public static final String BUNDLE_IDX = "BUNDLE_IDX";
    public static final String BUNDLE_AGREE_EMAIL  = "BUNDLE_AGREE_EMAIL";
    public static final String BUNDLE_AGREE_SMS  = "BUNDLE_AGREE_SMS";
    public static final String BUNDLE_VIEW_TYPE = "BUNDLE_VIEW_TYPE";
    public static final String BUNDLE_CAR_LIST = "BUNDLE_CAR_LIST";
    public static final String BUNDLE_PHONE_NUMBER = "BUNDLE_PHONE_NUMBER";
    public static final String TAG_PUSH = "TAG_PUSH";
    public static final String TAG_URL = "TAG_URL";
    public static final String TAG_TITLE = "TAG_TITLE";
    public static final String BUNDLE_PHOTO_LIST = "BUNDLE_PHOTO_LIST";
    public static final String BUNDLE_CAR_IDX = "BUNDLE_CAR_IDX";
    public static final String BUNDLE_POSITION = "BUNDLE_POSITION";
    public static final String BUNDLE_BACK_MOVE_TO_MAIN = "BUNDLE_BACK_MOVE_TO_MAIN";
    public static final String BUNDLE_TICKET_ID = "BUNDLE_TICKET_ID";

    /**
     * 주차면 타입(전체, 정상, 수동, 비정상)
     */
    public static final String BUNDLE_VIEW_TYPE_ALL = "BUNDLE_VIEW_TYPE_ALL";
    public static final String BUNDLE_VIEW_TYPE_NORMAL = "BUNDLE_VIEW_TYPE_NORMAL";
    public static final String BUNDLE_VIEW_TYPE_MANUAL = "BUNDLE_VIEW_TYPE_MANUAL";
    public static final String BUNDLE_VIEW_TYPE_ABNORMAL = "BUNDLE_VIEW_TYPE_ABNORMAL";
    public static final String SELECTED_IOT = "SELECTED_IOT";

    /**
     * 페이지 초기화
     */
    public static final String TAG_INITIAL_PAGE = "TAG_INITIAL_PAGE";

    /**
     * 자동차 종류
     */
    public static final String CAR_TYPE_SUB_COMPACT = "SUB_COMPACT";
    public static final String CAR_TYPE_COMPACT = "COMPACT";
    public static final String CAR_TYPE_MIDSIZE = "MIDSIZE";
    public static final String CAR_TYPE_FULL = "FULL_SIZED";
    public static final String CAR_TYPE_SUV = "SUV";
    public static final String CAR_TYPE_BUS = "BUS";
    public static final String CAR_TYPE_TRUCK = "TRUCK";
    public static final String CAR_TYPE_MOTORCYCLE = "MOTORCYCLE";

    /**
     * Special Symbol
     */
    public static final String FORMAT_PERCENT = "%";
    public static final String FORMAT_MINUS = "-";
    public static final String FORMAT_TIMER = "--:--";
    public static final String FORMAT_COLON = ":";
    public static final String FORMAT_WAVE = " ~ ";
    public static final String FORMAT_SLASH = " / ";
    public static final String FORMAT_STAR = "*";

    /**
     * Retrofit 반환 코드
     */
    public static final String RESULT_200 = "2000";
    public static final String RESULT_400 = "400";
    public static final String RESULT_SUCCESS = "SUCCESS";
    public static final String RESULT_INTERNAL_SERVER_ERROR  = "Internal Server Error";
    public static final String SERVER_ERROR_FAILED_CONNECT = "Failed to connect";
    public static final String SERVER_ERROR_FAILED_UNABLE_TO = "Unable to resolve host";

    /**
     * EditText 키보드 형식(이메일, 패스워드, 숫자...)
     */
    public static final int INPUT_TYPE_EMAIL = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int INPUT_TYPE_NUMBER = 3;
    public static final int INPUT_TYPE_TEXT = 4;
    public static final int INPUT_PHONE_NUM = 5;

    /**
     * Retrofit Request Header
     */
    public static final String PARAM_APP_TYPE = "ADMIN";
    public static final String PARAM_OS_TYPE = "ANDROID";
    public static final String LOGIN_TYPE_NAVER = "NAVER";
    public static final String HEADER_AUTHORATION = "Authorization";
    public static final String HEADER_BEARER = "Bearer ";
    public static final String HEADER_X_KSTPKI_KEY = "x-kstpkl-login";
    public static final String HEADER_X_KSTPKI_VALUE= "admin";
    public static final String COLOR_RED = "#ff5050";

    /**
     * 주차장 노외
     */
    public static final String PARKING_TYPE_NW = "NW";
    /**
     * Tmap에서 지도에 아이콘 뿌릴 때 필요한 주차면 key 값
     */
    public static final String PKL_DISCRETE = "PKL_DISCRETE";

    /**
     * 네트워크 상태(WIFI/LTE)
     */
    public static final String WIFI = "WIFI";
    public static final String LTE = "LTE";

    /**
     * 메인에서 토글로 보여주는 상태
     */
    public static final int MAIN_VIEW_DEFAULT_LIST = 0;
    public static final int MAIN_VIEW_DEFAULT_MAP = 1;

    /**
     *  MAP 상세
     */
    public static final int MAP_REFRESH_HANDLER = 0x001;
    public static final String ADMIN_ENTRANCE = "ADMIN_ENTRANCE";
    public static final String POS_APP_ADDRESS = "com.spcn.spcnpos";


    /**
     * 주차 요금 결제 View Type
     */
    public static final int INITIAL_VIEW_TYPE_MAIN = 0;//메인페이지
    public static final int INITIAL_VIEW_TYPE_PURCHASE = 1;//주차구매내역
    public static final int INITIAL_VIEW_TYPE_PARKING_STATUS = 2;//주차현황

    /**
     * 현재 위치 알 수 없을 때 서울역으로 초기화
     */
    public static final double MAP_DEFAULT_LATITUDE = 37.531596;
    public static final double MAP_DEFAULT_LONGITUDE = 127.024962;

    /**
     *  POS 로그인 데이터
     */
    public static final String POS_NUMBER = "PS10103813";
//    public static final String POS_NUMBER = "PS10084439";
    public static final String EUC_KR = "EUC-KR";

    /**
     * @return 임시 폴더
     */
    public static String getTempFolder() {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + "/smartpark";
    }

}
