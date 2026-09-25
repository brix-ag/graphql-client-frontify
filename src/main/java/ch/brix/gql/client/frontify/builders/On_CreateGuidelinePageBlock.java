package ch.brix.gql.client.frontify.builders;

public class On_CreateGuidelinePageBlock extends ch.brix.gql.client.TypeBuilder {
  public On_CreateGuidelinePageBlock() {
    super(new ch.brix.gql.client.On("CreateGuidelinePageBlock"));
  }
  /**
   * **BETA** The `GuidelinePageBlock` that was created.
   */
  public On_CreateGuidelinePageBlock block(CreateGuidelinePageBlock_block callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
