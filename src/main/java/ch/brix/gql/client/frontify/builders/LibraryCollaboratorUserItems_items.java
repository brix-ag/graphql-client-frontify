package ch.brix.gql.client.frontify.builders;

public class LibraryCollaboratorUserItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.User>> {
  public LibraryCollaboratorUserItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "User"));
  }
  public LibraryCollaboratorUserItems_items onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public LibraryCollaboratorUserItems_items onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
