package tacoball.com.geomancer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * 簡易頁面用的 Fragment，目前用於授權和貢獻者頁面
 */
public class SimpleFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int layoutId = getArguments().getInt("LAYOUT_ID");
        ViewGroup view = (ViewGroup)inflater.inflate(layoutId, null);

        ImageButton button = (ImageButton)view.findViewById(R.id.imgBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().sendBroadcast(MainUtils.buildFragmentSwitchIntent("MAIN"));
            }
        });

        return view;
    }

}
