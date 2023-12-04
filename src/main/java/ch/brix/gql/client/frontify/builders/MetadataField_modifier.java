package ch.brix.gql.client.frontify.builders;

public class MetadataField_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public MetadataField_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public MetadataField_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public MetadataField_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
