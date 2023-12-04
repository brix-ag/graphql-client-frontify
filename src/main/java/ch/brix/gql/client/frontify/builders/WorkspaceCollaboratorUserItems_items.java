package ch.brix.gql.client.frontify.builders;

public class WorkspaceCollaboratorUserItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.User>> {
  public WorkspaceCollaboratorUserItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "User"));
  }
  public WorkspaceCollaboratorUserItems_items onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WorkspaceCollaboratorUserItems_items onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
