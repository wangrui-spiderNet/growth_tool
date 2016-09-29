package cn.thinkjoy.startup.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.thinkjoy.startup.R;
import cn.thinkjoy.startup.base.BaseFragment;


/**
 * Created by wangrui on 2016/6/20.
 */
public class MsgPageFragment extends BaseFragment {
    private static MsgPageFragment stationFragment;
    private View view;
    public static final String TAG="MePageFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(view==null){
            view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_msg ,null);
        }else{
            ViewGroup viewGroup=(ViewGroup)(view.getParent());
            if(viewGroup!=null){
                viewGroup .removeView(view);
            }
        }
        return view;
    }

    @Override
    protected void findWidgets() {

    }

    @Override
    protected void initComponent() {

    }

    @Override
    public void onClick(View v) {

    }
}
