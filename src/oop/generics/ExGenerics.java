package oop.generics;

public class ExGenerics {
	public static void main(String[] args) {
		Whale whale = new Whale();
		ResponseDTO<Whale> responseWhale = new ResponseDTO<>();
		responseWhale.setSuccess(true);
		responseWhale.setMessage("Hello World");
		responseWhale.setData(whale);

		Hamo hamo = new Hamo();
		ResponseDTO<Hamo> responseHamo = new ResponseDTO<>();
		responseHamo.setSuccess(true);
		responseHamo.setMessage("Hello World");
		responseHamo.setData(hamo);
	}
}

class ResponseDTO<T> {
	private boolean success;
	private String message;
	private T data;

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

class Whale {}
class Hamo {}
class Squirrel {}
