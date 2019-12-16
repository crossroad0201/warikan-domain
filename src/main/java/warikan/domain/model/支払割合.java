package warikan.domain.model;

import java.math.BigDecimal;

public class 支払割合 {
  BigDecimal _割合;

  public 支払割合(BigDecimal _割合) {
    // FIXME 1未満の正数
    this._割合 = _割合;
  }
}
