import api from 'zmp-sdk';

api.openMiniApp({
  appId: '2394380198036053102',
  params: {
    key: 'value'
  },
  success: (res) => {
    console.log("running");

    // xử lý khi gọi api thành công
  },
  fail: (error) => {
    // xử lý khi gọi api thất bại
    console.log(error);
  }
});