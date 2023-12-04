package ch.brix.gql.client.frontify.builders;

public class Audio_previewUrl_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * `Audio` preview width value in pixels.
   * Default value: null
   */
  public Audio_previewUrl_Args width(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("width", value);
    return this;
  }
  /**
   * `Audio` preview height value in pixels.
   * Default value: null
   */
  public Audio_previewUrl_Args height(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("height", value);
    return this;
  }
}
