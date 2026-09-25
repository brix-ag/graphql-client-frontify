package ch.brix.gql.client.frontify.builders;

public class On_LibraryCollaboratorUserEdge extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryCollaboratorUserEdge() {
    super(new ch.brix.gql.client.On("LibraryCollaboratorUserEdge"));
  }
  /**
   * `User` that has the least required permissions to collaborate on a `Library`.
   */
  public On_LibraryCollaboratorUserEdge node(LibraryCollaboratorUserEdge_node callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `User` role in the `Library`.
   */
  public On_LibraryCollaboratorUserEdge role() {
    _add_field("role");
    return this;
  }
}
