import { Component, createElement } from "react";
import DeviceInfo from "react-native-device-info";
import { Platform, View } from "react-native";

const isTablet = DeviceInfo.isTablet();

export class NativePlatformWidget extends Component {
    render() {
        return <View>{this.renderContent()}</View>;
    }

    renderContent() {
        if (Platform.OS === 'ios') {
            if (isTablet && this.props.iosTabletContent?.length > 0) {
                console.info("NativeOrientationWidget: render iOS tablet content");
                return this.props.iosTabletContent;
            } else {
                console.info("NativeOrientationWidget: render iOS");
                return this.props.iosContent;
            }
        } else {
            if (isTablet && this.props.androidTabletContent?.length > 0) {
                console.info("NativeOrientationWidget: render Android tablet content");
                return this.props.androidTabletContent;
            } else {
                console.info("NativeOrientationWidget: render Android content");
                return this.props.androidContent;
            }
        }
    }
}
