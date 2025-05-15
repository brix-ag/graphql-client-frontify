package ch.brix.gql.client.frontify.builders;

public class On_CreativeTemplatePage extends ch.brix.gql.client.TypeBuilder {
  public On_CreativeTemplatePage() {
    super(new ch.brix.gql.client.On("CreativeTemplatePage"));
  }
  /**
   * Preview URL of `CreativeTemplatePage`.
   */
  public On_CreativeTemplatePage previewUrl() {
    _add_field("previewUrl");
    return this;
  }
  /**
   * Width of the `CreativeTemplatePage`.
   */
  public On_CreativeTemplatePage width() {
    _add_field("width");
    return this;
  }
  /**
   * Height of the `CreativeTemplatePage`.
   */
  public On_CreativeTemplatePage height() {
    _add_field("height");
    return this;
  }
  /**
   * `CreativeTemplatePage` unique identifier.
   */
  public On_CreativeTemplatePage pageIndex() {
    _add_field("pageIndex");
    return this;
  }
  /**
   * Name of the `CreativeTemplatePage`.
   */
  public On_CreativeTemplatePage name() {
    _add_field("name");
    return this;
  }
}
