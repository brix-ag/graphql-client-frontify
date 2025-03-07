package ch.brix.gql.client.frontify.builders;

public class On_LibraryCollaborators extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryCollaborators() {
    super(new ch.brix.gql.client.On("LibraryCollaborators"));
  }
  /**
   * `LibraryCollaboratorUserItems` list.
   */
  public On_LibraryCollaborators users(LibraryCollaborators_users callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
