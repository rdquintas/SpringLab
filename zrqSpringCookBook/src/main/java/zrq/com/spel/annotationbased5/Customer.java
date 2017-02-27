package zrq.com.spel.annotationbased5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {

	@Value("#{testBean.map['MapB']}")
	private String mapA;

	@Value("#{testBean.list[1]}")
	private String list;

	public String getMapA() {
		return mapA;
	}

	public void setMapA(String mapA) {
		this.mapA = mapA;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Customer [mapA=" + mapA + ", list=" + list + "]";
	}
}