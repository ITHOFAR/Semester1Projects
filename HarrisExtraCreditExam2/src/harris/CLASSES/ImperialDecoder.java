package harris.CLASSES;

import harris.INTERFACES.Analyzable;

//Parent Class
public abstract class ImperialDecoder implements Analyzable{
	private String decoderID;
	public static String msgDirectory;
	
	public ImperialDecoder(String decoderID) {
		this.decoderID = decoderID;
		this.msgDirectory = "/Users/ithofar/eclipse-workspace/HarrisExtraCreditExam2/src/harris.FILES/";
		
	}
	
	public String getDecoderID() {
		return decoderID;
	}

	public void setDecoderID(String decoderID) {
		this.decoderID = decoderID;
	}

	public static String getMsgDirectory() {
		return msgDirectory;
	}

	public static void setMsgDirectory(String msgDirectory) {
		ImperialDecoder.msgDirectory = msgDirectory;
	}

	
}
