package cn.intelvision.response.vqds;

import cn.intelvision.model.VQDS;
import cn.intelvision.response.ZenoResponse;

import java.util.List;

/**
 * Created by pc on 2016/3/16.
 */
public class VqdsListResponse extends ZenoResponse {
    private List<VQDS> vqds;

    public List<VQDS> getVqds() {
        return vqds;
    }

    public void setVqds(List<VQDS> vqds) {
        this.vqds = vqds;
    }
}
