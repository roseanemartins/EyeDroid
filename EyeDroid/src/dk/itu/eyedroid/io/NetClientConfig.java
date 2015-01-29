package dk.itu.eyedroid.io;

/**
 * Network messages for communication protocol and client calibration.
 * Standard 12 byte int msgs.
 * 
 * TCPtestClient client: https://github.com/dmardanbeigi/GlassGaze
 */
public class NetClientConfig {
	
	public static final String TAG = "EyeNet";
	
	public static final int NO_POINTS = 4;					//Number of points to calibrate
	public static final int WAIT_TO_SAMPLE = 50;			//Time to wait for the next sample during 1 point calibration
	public static final int NO_SAMPLES = 120;					//Number of point calibration samples
	public final static int MSG_SIZE = 12; 					//byteArray[12]
	
	//Client app to EyeDroid
	
	public static final int TO_EYEDROID_CALIBRATE_DISPLAY_4 = 1005;			//Client requests calibration
	public static final int TO_EYEDROID_READY = 1000;						//Notify EyeDroid client ready
	public static final int TO_EYEDROID_STREAM_GAZE_RGT_START = 1002;		//Start sending coordinates (RGT mapping)
	public static final int TO_EYEDROID_STREAM_GAZE_RGT_STOP = 1004;		//Stop sending coordinates (RGT mapping)
	public static final int TO_EYEDROID_STREAM_GAZE_HMGT_START = 1001; 		//Start sending coordinates (HMGT mapping)
	public static final int TO_EYEDROID_STREAM_GAZE_HMGT_STOP = 1003;		//STOP sending coordinates (HMGT mapping)
	public static final int TO_EYEDROID_CALIBRATE_DISPLAY_Correct = 1006;	//Correct calibration
	
	//EyeDroid to client
	
	public static final int TO_CLIENT_CALIBRATE_DISPLAY = 2004;				//Start calibration on client
	public static final int TO_CLIENT_GAZE_RGT = 2002;						//Send coordinates (RGT mapping)
	public static final int TO_CLIENT_GAZE_HMGT = 2003;						//Send coordinates (HMGT mapping)
	
}
