package ch.brix.gql.client.frontify.builders;

public class Video_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public Video_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public Video_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Video_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
