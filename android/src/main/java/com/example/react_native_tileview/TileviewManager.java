package com.example.react_native_tileview;

import android.app.Activity;
import android.os.Environment;


import com.facebook.common.file.FileUtils;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;


import com.qozix.tileview.TileView;

import java.io.File;

public class TileviewManager extends SimpleViewManager<TileviewView> {
    public static final String REACT_CLASS = "Tileview";
    private Activity mActivity = null;
    private ThemedReactContext mContext = null;
    private TileviewView mTileviewView;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected TileviewView createViewInstance(ThemedReactContext reactContext) {
        mContext = reactContext;
        mActivity = reactContext.getCurrentActivity();
        mTileviewView = new TileviewView(reactContext);
        return mTileviewView;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @ReactProp(name = "displayTiles")
    protected void displayTiles(TileView tileView, String filePath) {
//        File documentDIr = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
//        String fullPath = documentDIr.toString();
//        fullPath.concat(filePath);
//
//        // size of original image at 100% mScale
//        tileView.setSize(4015, 4057);
//
//        // we're running from assets, should be fairly fast decodes, go ahead and render asap
//        tileView.setShouldRenderWhilePanning(true);
//
//        // detail levels
//        tileView.addDetailLevel(1.000f, fullPath.concat("/6/%d/%d.jpg"));
//        tileView.addDetailLevel(0.500f, fullPath.concat("/5/%d/%d.jpg"));
//        tileView.addDetailLevel(0.250f, fullPath.concat("/4/%d/%d.jpg"));
//
//        // allow scaling past original size
//        tileView.setScaleLimits(0, 2);
//
//        tileView.setMarkerAnchorPoints(-0.5f, -0.5f);
//
//        tileView.scrollToAndCenter( 3267, 1896);
    }
}
