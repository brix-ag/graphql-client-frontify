package ch.brix.gql.client.frontify.builders;

public class On_LibraryCollaboratorUserItems extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryCollaboratorUserItems() {
    super(new ch.brix.gql.client.On("LibraryCollaboratorUserItems"));
  }
  /**
   * Total amount of results.
   */
  public On_LibraryCollaboratorUserItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_LibraryCollaboratorUserItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_LibraryCollaboratorUserItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_LibraryCollaboratorUserItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `User` items that have lowest required permissions to collaborate on a `Library`.
   */
  public On_LibraryCollaboratorUserItems items(LibraryCollaboratorUserItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** List of `LibraryCollaboratorUserEdge` edges.
   */
  public On_LibraryCollaboratorUserItems edges(LibraryCollaboratorUserItems_edges callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
