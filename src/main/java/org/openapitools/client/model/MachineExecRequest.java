/*
 * Fly Machines API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MachineExecRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-31T17:25:53.139932930Z[Europe/London]")
public class MachineExecRequest {
  public static final String SERIALIZED_NAME_CMD = "cmd";
  @SerializedName(SERIALIZED_NAME_CMD)
  private String cmd;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;

  public MachineExecRequest() {
  }

  public MachineExecRequest cmd(String cmd) {
    this.cmd = cmd;
    return this;
  }

   /**
   * Deprecated: use Command instead
   * @return cmd
  **/
  @javax.annotation.Nullable
  public String getCmd() {
    return cmd;
  }

  public void setCmd(String cmd) {
    this.cmd = cmd;
  }


  public MachineExecRequest command(List<String> command) {
    this.command = command;
    return this;
  }

  public MachineExecRequest addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @javax.annotation.Nullable
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }


  public MachineExecRequest timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @javax.annotation.Nullable
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineExecRequest machineExecRequest = (MachineExecRequest) o;
    return Objects.equals(this.cmd, machineExecRequest.cmd) &&
        Objects.equals(this.command, machineExecRequest.command) &&
        Objects.equals(this.timeout, machineExecRequest.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cmd, command, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineExecRequest {\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cmd");
    openapiFields.add("command");
    openapiFields.add("timeout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MachineExecRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MachineExecRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MachineExecRequest is not found in the empty JSON string", MachineExecRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MachineExecRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MachineExecRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cmd") != null && !jsonObj.get("cmd").isJsonNull()) && !jsonObj.get("cmd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cmd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cmd").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("command") != null && !jsonObj.get("command").isJsonNull() && !jsonObj.get("command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `command` to be an array in the JSON string but got `%s`", jsonObj.get("command").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MachineExecRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MachineExecRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MachineExecRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MachineExecRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MachineExecRequest>() {
           @Override
           public void write(JsonWriter out, MachineExecRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MachineExecRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MachineExecRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MachineExecRequest
  * @throws IOException if the JSON string is invalid with respect to MachineExecRequest
  */
  public static MachineExecRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MachineExecRequest.class);
  }

 /**
  * Convert an instance of MachineExecRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

