package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockReference extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockReference() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockReference"));
  }
  /**
   * **BETA** The id of the `GuidelinePageBlockReference`.
   */
  public On_GuidelinePageBlockReference id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The `GuidelinePageBlock` that this reference resolves to.
   */
  public On_GuidelinePageBlockReference block(GuidelinePageBlockReference_block callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
