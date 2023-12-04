package ch.brix.gql.client.frontify.builders;

public class File_modifier extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public File_modifier() {
    super(new ch.brix.gql.client.Call<>("modifier", "User"));
  }
  public File_modifier onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public File_modifier onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
