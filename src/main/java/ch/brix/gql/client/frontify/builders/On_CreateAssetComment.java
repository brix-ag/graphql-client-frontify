package ch.brix.gql.client.frontify.builders;

public class On_CreateAssetComment extends ch.brix.gql.client.TypeBuilder {
  public On_CreateAssetComment() {
    super(new ch.brix.gql.client.On("CreateAssetComment"));
  }
  /**
   * `AssetComment` details.
   */
  public On_CreateAssetComment comment(CreateAssetComment_comment callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
