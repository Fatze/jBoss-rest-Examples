package ST.I.Tooling.Rest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Dostanko_VL on 08.10.2015.
 */
@XmlRootElement(name = "HelloMsgTo")
@XmlAccessorType(XmlAccessType.FIELD)
public class MyServiceHello {
    public MyServiceHello(){}

    @XmlElement(name = "ToName" )
    protected String name;


    public String getName() {
        return "Hello: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
