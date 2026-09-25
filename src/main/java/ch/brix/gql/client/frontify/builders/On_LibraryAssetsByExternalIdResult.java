package ch.brix.gql.client.frontify.builders;

public class On_LibraryAssetsByExternalIdResult extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryAssetsByExternalIdResult() {
    super(new ch.brix.gql.client.On("LibraryAssetsByExternalIdResult"));
  }
  /**
   * `Asset` items carrying the externalId.
   */
  public On_LibraryAssetsByExternalIdResult items(LibraryAssetsByExternalIdResult_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Opaque cursor for the next result page; null when there are no further results.
   */
  public On_LibraryAssetsByExternalIdResult nextCursor() {
    _add_field("nextCursor");
    return this;
  }
}
