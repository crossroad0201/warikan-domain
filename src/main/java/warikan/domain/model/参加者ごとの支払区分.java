package warikan.domain.model;

import io.vavr.collection.Map;
import warikan.domain.model.members.Member;

public class 参加者ごとの支払区分 {
  Map<Member, 支払区分> _参加者ごとの支払区分;

  public 参加者ごとの支払区分(Map<Member, 支払区分> _参加者ごとの支払区分) {
    this._参加者ごとの支払区分 = _参加者ごとの支払区分;
  }
}
