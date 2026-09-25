package ch.brix.gql.client.frontify.builders;

public class On_RemoveCatalog extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCatalog() {
    super(new ch.brix.gql.client.On("RemoveCatalog"));
  }
  /**
   * **BETA** The ID of the `Catalog` that was just removed.
   */
  public On_RemoveCatalog id() {
    _add_field("id");
    return this;
  }
}
