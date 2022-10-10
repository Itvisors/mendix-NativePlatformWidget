import { Platform, View } from "react-native";
import DeviceInfo from "react-native-device-info";
import { createElement } from "react";

const isTablet = DeviceInfo.isTablet();

export function NativePlatformWidget(props) {
    const renderContent = () => {
        if (Platform.OS === "ios") {
            if (isTablet && props.iosTabletContent?.length > 0) {
                // console.info("NativeOrientationWidget: render iOS tablet content");
                return props.iosTabletContent;
            } else {
                // console.info("NativeOrientationWidget: render iOS");
                return props.iosContent;
            }
        } else {
            if (isTablet && props.androidTabletContent?.length > 0) {
                // console.info("NativeOrientationWidget: render Android tablet content");
                return props.androidTabletContent;
            } else {
                // console.info("NativeOrientationWidget: render Android content");
                return props.androidContent;
            }
        }
    };
    return <View>{renderContent()}</View>;
}
