package com.example.react_native_tileview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.widget.LinearLayout;

import com.facebook.react.uimanager.ThemedReactContext;
import com.qozix.tileview.TileView;

public class TileviewView extends LinearLayout {
    public TileviewView(ThemedReactContext context) {
        super(context);

        initViews(context);
    }

    private void initViews(ThemedReactContext context) {
        Activity mActivity = context.getCurrentActivity();
        TileView tileView = mActivity.findViewById(R.id.mtileview);

        new TileView.Builder(tileView)
//                .setSize(1024, 1444)
//                .defineZoomLevel(1, "http://nois.newoceaninfosys.com:44413/media/a5cbb8780015449fa068f8dfde02f856/1-%1$d-%2$d.png")
                .setSize(17934, 13452)
                .defineZoomLevel("tiles/phi-1000000-%1$d_%2$d.jpg")
//                .defineZoomLevel(1, "tiles/phi-500000-%1$d_%2$d.jpg")
//                .defineZoomLevel(2, "tiles/phi-250000-%1$d_%2$d.jpg")
//                .installPlugin(new MarkerPlugin(this))
//                .installPlugin(new InfoWindowPlugin(infoView))
//                .installPlugin(new CoordinatePlugin(WEST, NORTH, EAST, SOUTH))
//                .installPlugin(new HotSpotPlugin())
//                .installPlugin(new PathPlugin())
                .addReadyListener(new TileView.ReadyListener() {
                    @Override
                    public void onReady(TileView tileView) {

                    }
                })
                .build();
    }
}
