package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryAssetsByExternalIdResult {
  /**
   * `Asset` items carrying the externalId.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> items;
  /**
   * Opaque cursor for the next result page; null when there are no further results.
   */
  @com.google.gson.annotations.SerializedName("nextCursor")
  private ch.brix.gql.client.frontify.scalars.StringScalar nextCursor;
}
