package ch.brix.gql.client.frontify.builders;

public class Document_previewUrl_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Document` preview width value in pixels.
   * Default value: null
   */
  public Document_previewUrl_Args width(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("width", value);
    return this;
  }
  /**
   * `Document` preview height value in pixels.
   * Default value: null
   */
  public Document_previewUrl_Args height(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("height", value);
    return this;
  }
  /**
   * `Document` preview page number.
   * Default value: null
   */
  public Document_previewUrl_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
}
