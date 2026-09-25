package ch.brix.gql.client.frontify.builders;

public class On_IngestCatalogRows extends ch.brix.gql.client.TypeBuilder {
  public On_IngestCatalogRows() {
    super(new ch.brix.gql.client.On("IngestCatalogRows"));
  }
  /**
   * **BETA** Number of new `CatalogRow` created.
   */
  public On_IngestCatalogRows created() {
    _add_field("created");
    return this;
  }
  /**
   * **BETA** Number of existing `CatalogRow` updated.
   */
  public On_IngestCatalogRows updated() {
    _add_field("updated");
    return this;
  }
  /**
   * **BETA** Number of `CatalogRow` skipped (null primary key values).
   */
  public On_IngestCatalogRows skipped() {
    _add_field("skipped");
    return this;
  }
}
