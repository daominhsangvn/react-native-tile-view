import React from 'react';
import PropTypes from 'prop-types';
import { requireNativeComponent, View } from 'react-native';

const propTypes = {
  displayTiles: PropTypes.string,
  ...View.propTypes // include the default view properties
}

class TileView extends React.Component {
  render() {
    return (
      <NativeTileView {...this.props} />
    )
  }
}

TileView.propTypes = propTypes;

const NativeTileView = requireNativeComponent('Tileview', TileView);

module.exports = NativeTileView;

// 'use strict';
// /**
//  * This exposes the native ToastAndroid module as a JS module. This has a
//  * function 'show' which takes the following parameters:
//  *
//  * 1. String message: A string with the text to toast
//  * 2. int duration: The duration of the toast. May be ToastAndroid.SHORT or
//  *    ToastAndroid.LONG
//  */
// import { NativeModules } from 'react-native';
// module.exports = NativeModules.Tileview;
