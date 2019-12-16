package warikan.domain.model;

import io.vavr.collection.Map;

public class 支払区分ごとの支払割合 {
  Map<支払区分, 支払割合> _支払区分ごとの支払割合;

  public 支払区分ごとの支払割合(Map<支払区分, 支払割合> _支払区分ごとの支払割合) {
    this._支払区分ごとの支払割合 = _支払区分ごとの支払割合;
  }
}
