package ch08.sec02;

public class Audio implements RemoteControl{
	// 필드
	private int volume;
	private int memoryVolume;
	// 중요. 추상 메소드는 반드시 오버라이드해서 구현을 해야한다.
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");	
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");	
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 audio 볼륨 : " + this.volume);
	}

	// 디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume; // 기존 볼륨 크기 저장
			System.out.println("무음처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME); 
		}else {
			System.out.println("무음해제합니다.");
			setVolume(this.memoryVolume); // 원래 볼륨 크기로 돌려줌
		}
	}
	

}