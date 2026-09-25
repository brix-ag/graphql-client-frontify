package ch.brix.gql.client.frontify.builders;

public class WorkspaceProjectCollaboratorUserEdge_node extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.User> {
  public WorkspaceProjectCollaboratorUserEdge_node() {
    super(new ch.brix.gql.client.Call<>("node", "User"));
  }
  public WorkspaceProjectCollaboratorUserEdge_node onAccountUser(On_AccountUser typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public WorkspaceProjectCollaboratorUserEdge_node onUser(On_User typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
