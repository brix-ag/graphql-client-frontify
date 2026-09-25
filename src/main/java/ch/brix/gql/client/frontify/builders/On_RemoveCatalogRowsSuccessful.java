package ch.brix.gql.client.frontify.builders;

public class On_RemoveCatalogRowsSuccessful extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCatalogRowsSuccessful() {
    super(new ch.brix.gql.client.On("RemoveCatalogRowsSuccessful"));
  }
  /**
   * **BETA** The IDs of the `CatalogRow`s that were just removed.
   */
  public On_RemoveCatalogRowsSuccessful ids() {
    _add_field("ids");
    return this;
  }
}
