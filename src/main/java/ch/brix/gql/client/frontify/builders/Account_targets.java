package ch.brix.gql.client.frontify.builders;

public class Account_targets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.TargetItems> {
  public Account_targets() {
    super(new ch.brix.gql.client.Call<>("targets", "TargetItems"));
  }
  public Account_targets args(Account_targets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Account_targets onTargetItems(On_TargetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
