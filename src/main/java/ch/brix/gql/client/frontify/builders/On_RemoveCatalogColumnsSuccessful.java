package ch.brix.gql.client.frontify.builders;

public class On_RemoveCatalogColumnsSuccessful extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCatalogColumnsSuccessful() {
    super(new ch.brix.gql.client.On("RemoveCatalogColumnsSuccessful"));
  }
  /**
   * **BETA** The IDs of the `CatalogColumn`s that were just removed.
   */
  public On_RemoveCatalogColumnsSuccessful ids() {
    _add_field("ids");
    return this;
  }
}
