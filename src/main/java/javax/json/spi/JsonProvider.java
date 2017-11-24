/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package javax.json.spi;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonBuilderFactory;
import javax.json.JsonMergePatch;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonPatch;
import javax.json.JsonPatchBuilder;
import javax.json.JsonPointer;
import javax.json.JsonReader;
import javax.json.JsonReaderFactory;
import javax.json.JsonString;
import javax.json.JsonStructure;
import javax.json.JsonValue;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParserFactory;

public abstract class JsonProvider {
    private static final class Holder {
        private static final JsonProvider DEFAULT = new org.apache.johnzon.core.JsonProviderImpl();
    }
    
    protected JsonProvider() {
        // no-op
    }

    public static JsonProvider provider() {
        return Holder.DEFAULT;
    }

    public abstract JsonParser createParser(Reader reader);

    public abstract JsonParser createParser(InputStream var1);

    public abstract JsonParserFactory createParserFactory(Map<String, ?> var1);

    public abstract JsonGenerator createGenerator(Writer var1);

    public abstract JsonGenerator createGenerator(OutputStream var1);

    public abstract JsonGeneratorFactory createGeneratorFactory(Map<String, ?> var1);

    public abstract JsonReader createReader(Reader var1);

    public abstract JsonReader createReader(InputStream var1);

    public abstract JsonWriter createWriter(Writer var1);

    public abstract JsonWriter createWriter(OutputStream var1);

    public abstract JsonWriterFactory createWriterFactory(Map<String, ?> var1);

    public abstract JsonReaderFactory createReaderFactory(Map<String, ?> var1);

    public abstract JsonObjectBuilder createObjectBuilder();

    public JsonObjectBuilder createObjectBuilder(JsonObject jsonObject) {
        throw new UnsupportedOperationException();
    }

    public JsonObjectBuilder createObjectBuilder(Map<String, Object> map) {
        throw new UnsupportedOperationException();
    }

    public abstract JsonArrayBuilder createArrayBuilder();

    public JsonArrayBuilder createArrayBuilder(JsonArray initialData) {
        throw new UnsupportedOperationException();
    }

    public JsonArrayBuilder createArrayBuilder(Collection<?> initialData) {
        throw new UnsupportedOperationException();
    }

    public JsonPointer createPointer(String path) {
        throw new UnsupportedOperationException();
    }

    public abstract JsonBuilderFactory createBuilderFactory(Map<String, ?> var1);

    public JsonString createValue(String value) {
        throw new UnsupportedOperationException();
    }

    public JsonNumber createValue(int value) {
        throw new UnsupportedOperationException();
    }

    public JsonNumber createValue(long value) {
        throw new UnsupportedOperationException();
    }

    public JsonNumber createValue(double value) {
        throw new UnsupportedOperationException();
    }

    public JsonNumber createValue(BigDecimal value) {
        throw new UnsupportedOperationException();
    }

    public JsonNumber createValue(BigInteger value) {
        throw new UnsupportedOperationException();
    }

    public JsonPatch createPatch(JsonArray array) {
        throw new UnsupportedOperationException();
    }

    public JsonPatch createDiff(JsonStructure source, JsonStructure target) {
        throw new UnsupportedOperationException();
    }

    public JsonPatchBuilder createPatchBuilder() {
        throw new UnsupportedOperationException();
    }

    public JsonPatchBuilder createPatchBuilder(JsonArray initialData) {
        throw new UnsupportedOperationException();
    }

    public JsonMergePatch createMergePatch(JsonValue patch) {
        throw new UnsupportedOperationException();
    }

    public JsonMergePatch createMergeDiff(JsonValue source, JsonValue target) {
        throw new UnsupportedOperationException();
    }
}

