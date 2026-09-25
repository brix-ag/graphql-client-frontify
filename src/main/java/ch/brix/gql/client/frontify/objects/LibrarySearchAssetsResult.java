package ch.brix.gql.client.frontify.objects;

/**
 * Deliberately cursor-paginated rather than the schema's usual `limit`/`page`/`total` shape: the<br>underlying search index paginates via `search_after`, which has no depth limit, unlike<br>offset-based `from`/`size` paging. (When `searchTerm` is set, a different, deep-pagination-<br>capped strategy applies instead — see `AssetSearchInput.searchTerm`.)
 */
@lombok.Data
public class LibrarySearchAssetsResult {
  /**
   * Matched `Asset` items.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.interfaces.Asset.class)
  private java.util.List<ch.brix.gql.client.frontify.interfaces.Asset> items;
  /**
   * Opaque cursor for the next result page; null when there are no further results.
   */
  @com.google.gson.annotations.SerializedName("nextCursor")
  private ch.brix.gql.client.frontify.scalars.StringScalar nextCursor;
  /**
   * Whether a further result page exists.
   */
  @com.google.gson.annotations.SerializedName("hasNextPage")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar hasNextPage;
}
