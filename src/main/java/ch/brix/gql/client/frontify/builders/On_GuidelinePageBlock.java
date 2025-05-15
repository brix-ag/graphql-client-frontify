package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlock extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlock() {
    super(new ch.brix.gql.client.On("GuidelinePageBlock"));
  }
  /**
   * **BETA** The id of the `GuidelinePageBlock`.
   */
  public On_GuidelinePageBlock id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The searchable content of the `GuidelinePageBlock`. When the block cannot be serialized, this field is `null`.
   */
  public On_GuidelinePageBlock content() {
    _add_field("content");
    return this;
  }
  /**
   * **BETA** The url of the `GuidelinePageBlock`
   */
  public On_GuidelinePageBlock url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePageBlock`. If not modified, this represents the creation time.
   */
  public On_GuidelinePageBlock modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
}
