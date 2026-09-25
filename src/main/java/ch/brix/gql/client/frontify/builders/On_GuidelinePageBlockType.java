package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockType extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockType() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockType"));
  }
  /**
   * **BETA** The block type id of a `GuidelinePageBlock`.
   */
  public On_GuidelinePageBlockType id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The block type name of a `GuidelinePageBlock`.
   */
  public On_GuidelinePageBlockType name() {
    _add_field("name");
    return this;
  }
  /**
   * **BETA** The JSON schema defining the expected settings structure for a `GuidelinePageBlock` of this type.
   */
  public On_GuidelinePageBlockType settingsSchema() {
    _add_field("settingsSchema");
    return this;
  }
}
