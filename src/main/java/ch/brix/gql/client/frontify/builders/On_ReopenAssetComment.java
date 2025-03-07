package ch.brix.gql.client.frontify.builders;

public class On_ReopenAssetComment extends ch.brix.gql.client.TypeBuilder {
  public On_ReopenAssetComment() {
    super(new ch.brix.gql.client.On("ReopenAssetComment"));
  }
  /**
   * The reopened `AssetComment`.
   */
  public On_ReopenAssetComment comment(ReopenAssetComment_comment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
