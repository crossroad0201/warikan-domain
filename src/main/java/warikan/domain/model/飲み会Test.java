package warikan.domain.model;

import io.vavr.collection.Map;
import warikan.domain.model.members.Member;
import warikan.domain.model.members.MemberName;
import warikan.domain.model.members.SecretaryType;

import java.math.BigDecimal;

class 飲み会Test {
    public void test() {
        var 忘年会 = new 飲み会(
            new 参加者ごとの支払区分(
                Map.of(
                    Member.of(MemberName.of("Aさん"), SecretaryType.NonSecretary), 支払区分._多め,
                    Member.of(MemberName.of("Bさん"), SecretaryType.NonSecretary), 支払区分._普通,
                    Member.of(MemberName.of("Cさん"), SecretaryType.NonSecretary), 支払区分._普通,
                    Member.of(MemberName.of("Dさん"), SecretaryType.NonSecretary), 支払区分._少なめ
                )
            ),
            new 支払区分ごとの支払割合(
                Map.of(
                    支払区分._多め, new 支払割合(BigDecimal.valueOf(5)),
                    支払区分._普通, new 支払割合(BigDecimal.valueOf(4)),
                    支払区分._少なめ, new 支払割合(BigDecimal.valueOf(3)),
                )
            ),
            new 請求金額(Money.of(BigDecimal.valueOf(160000)))
        )

        var 参加者ごとの支払金額 = 忘年会.参加者ごとの支払金額を計算する();

        System.out.println(参加者ごとの支払金額.参加者の支払金額(Member.of(MemberName.of("Aさん"), SecretaryType.NonSecretary)))
    }

}
