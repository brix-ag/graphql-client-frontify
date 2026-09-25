package ch.brix.gql.client.frontify.builders;

public class On_LibrarySearchAssetsResult extends ch.brix.gql.client.TypeBuilder {
  public On_LibrarySearchAssetsResult() {
    super(new ch.brix.gql.client.On("LibrarySearchAssetsResult"));
  }
  /**
   * Matched `Asset` items.
   */
  public On_LibrarySearchAssetsResult items(LibrarySearchAssetsResult_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Opaque cursor for the next result page; null when there are no further results.
   */
  public On_LibrarySearchAssetsResult nextCursor() {
    _add_field("nextCursor");
    return this;
  }
  /**
   * Whether a further result page exists.
   */
  public On_LibrarySearchAssetsResult hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
