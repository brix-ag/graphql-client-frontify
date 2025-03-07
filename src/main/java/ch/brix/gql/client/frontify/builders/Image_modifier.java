package ch.brix.gql.client.frontify.builders;

public class Image_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public Image_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public Image_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public Image_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
