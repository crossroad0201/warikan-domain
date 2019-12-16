package warikan.domain.model;

import io.vavr.collection.Map;
import warikan.domain.model.members.Member;

public class 参加者ごとの支払金額 {
  Map<Member, 支払金額> _参加者ごとの支払金額;

  参加者ごとの支払金額(Map<Member, 支払金額> _参加者ごとの支払金額) {
    this._参加者ごとの支払金額 = _参加者ごとの支払金額;
  }

  public 支払金額 参加者の支払金額(Member _参加者) {
    return _参加者ごとの支払金額.get(_参加者).get();
  }
}
