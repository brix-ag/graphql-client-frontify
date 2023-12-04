package ch.brix.gql.client.frontify.builders;

public class On_ResolveAssetComment extends ch.brix.gql.client.TypeBuilder {
  public On_ResolveAssetComment() {
    super(new ch.brix.gql.client.On("ResolveAssetComment"));
  }
  /**
   * The resolved `AssetComment`.
   */
  public On_ResolveAssetComment comment(ResolveAssetComment_comment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
