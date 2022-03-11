Tìm tài khoản bị trừ tiền theo mã tài khoản
Tìm tài khoản được nhận tiền theo mã tài khoản
Nếu không tìm được tài khoản có nghĩa mã tài khoản bị lỗi, throw BankException
Nếu số tiền trong tài khoản bị trừ tiền nhỏ hơn số tiền phải chuyển cũng throw BankException
Nếu tài khoản nhận tiền bị đóng băng cũng throw BankException
Nếu mọi thứ hợp lệ thì trừ tiền từ tài khoản chuyển đi, cộng tiền từ tài khoản nhận
Trả về kết quả.